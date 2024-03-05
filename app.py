from flask import Flask
import json
import os

app = Flask(__name__)

dir_path = os.path.dirname(os.path.realpath(__file__))
FILEPATH = dir_path + '/users.json'


@app.route('/check/<username>/<password>')
def check(username=None, password=None):
    if username == None or password == None:
        return 'error'

    with open(FILEPATH, 'r') as jsonfile:
        if len(jsonfile.read()) == 0:
            return 'error: no user found'
        jsonfile.seek(0)

        data = json.load(jsonfile)

        for user in data:
            if user['username'] == username and user['password'] == password:
                return 'success'

    return 'error: invalid credentials'


@app.route('/signup/<username>/<password>')
def signup(username=None, password=None):
    if username == None or password == None:
        return 'error'

    new_data = {'username': username, 'password': password}

    with open(FILEPATH, 'r') as infile:
        l = len(infile.read())
        infile.seek(0)
        if l == 0:
            data = []
        else:
            data = json.loads(infile.read())

        for dat in data:
            if dat['username'] == username:
                return 'error: user already exists'

    with open(FILEPATH, 'w') as outfile:
        try:
            data.append(new_data)
            json.dump(data, outfile)
        except Exception as exc:
            print(exc)
            return 'error'
        return 'success'


if __name__ == '__main__':
    app.run(port=8080, debug=True)
