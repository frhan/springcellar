import React from 'react';
import "./wine.css";
import 'whatwg-fetch';


export default class Wine extends React.Component {
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
            <ItemList items={this.state.photos}/>
        );
    }
}

function ItemList({items}) {
    return (
        <div>
            { items.map(item =>
                <div className="col-md-2 column productbox" key={item.id}>
                    <img src={item.image} className="img-responsive" alt="#"/>
                    <div className="producttitle">{item.name}</div>
                    <div className="productprice">
                        <div className="pull-right"><a href="#" className="btn btn-danger btn-sm" role="button">BUY</a>
                        </div>
                        <div className="pricetext">{item.price}</div>
                    </div>
                </div>
            )}
        </div>
    );
}
