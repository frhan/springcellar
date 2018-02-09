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
        let response = await fetch("http://www.mocky.io/v2/5a7c37812e00004700052816").then((resp) => resp.json());
        this.setState({
            photos: response
        });
    }

    render() {
        return (
            <div id="products" className="row list-group">
                { this.state.photos.map(item =>
                    <Wine id={item.id} name={item.name} image={item.image} price={item.price}/>
                )
                }
            </div>
        );
    }
}
