import React, {Component} from 'react';

class Wine extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="item col-xs-4 col-md-12  list-group-item" key={this.props.id}>
                <div className="thumbnail">
                    <img className="group list-group-image" src={this.props.image} alt=""/>
                    <div className="caption">
                        <h4 className="group inner list-group-item-heading">{this.props.name}</h4>
                        <p className="group inner list-group-item-text">
                            Product description... Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                            sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                        <div className="row">
                            <div className="col-xs-12 col-md-6">
                                <p className="lead">$ {this.props.price}</p>
                            </div>
                            <div className="col-xs-12 col-md-6">
                                <a className="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Wine;
