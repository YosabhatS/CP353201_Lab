from flask import Flask, request
from flask_restful import Resource, Api
from flasgger import Swagger
from MoviePortal import Movie

app = Flask(__name__)
api = Api(app)
swagger = Swagger(app)

Movie = [
    {"playlist_id":1,"playlist_name":"datenight","movie_list":["The Notebook", "50 First Dates", "A Walk to Remember"]},
    {"playlist_id":2,"playlist_name":"action","movie_list":["Die Hard", "Mad Max: Fury Road", "John Wick"]},
    {"playlist_id":3,"playlist_name":"comedy","movie_list":["Superbad", "Step Brothers", "The Hangover"]}
]

class Playlist(Resource):
    def get(self):
        """ 
        Get all playlist 
        ---
        responses:
          200:
            description: All playlist
        """
        return Movie, 200
    
    def post(self):
        """
        Create a new playlist
        ---
        parameters:
          - in: body
            name: playlist
            required: true
            schema: 
                playlist_id: Playlist 
                required:
                    - playlist_name 
                properties: 
                    playlist_name: 
                        type: string 
                        description: The name of the playlist
                    movie_list: 
                        type: array
                        items:
                            type: string
                        description: The list of movie in playlist
        responses:
            201:
                description: A new book created
            400:
                description: Bad request
        """
        new_id = Movie[-1]['playlist_id'] + 1
        data = request.get_json()       # retrieves the JSON data from the request object
        new_playlist = {'playlist_id': new_id, 'playlist_name': data['playlist_name'], 'movie_list': data['movie_list']}
        Movie.append(new_playlist)
        return new_playlist, 201
    
# Routes 
api.add_resource(Playlist, '/Playlist')

# Run the app
if __name__ == '__main__':
    app.run(debug=True)