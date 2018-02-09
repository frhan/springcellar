import React from 'react';
import "./wine.css";
import Wine from  "./Wine";
import 'whatwg-fetch';


export default class WineList extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            photos: []
        };
    }

    componentWillMount() {
        this.fetchPhotos();
    }

    async fetchPhotos() {
        let response = await fetch("http://localhost:8080/api/wines").then((resp) => resp.json());
        //console.log(response);
        this.setState({
            photos: response
        });
    }

    render() {
        return (
            <div id="products" className="row list-group">
                {
                    this.state.photos.map(item =>
                        <Wine key={item.id} value={item}/>
                )
                }
            </div>
        );
    }
}
