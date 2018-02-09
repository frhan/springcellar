import React, {Component} from 'react';

class Wine extends Component {
   
    render() {
        return (
            <div className="item col-xs-4 col-md-12  list-group-item" key={this.props.value.id}>
                <div className="thumbnail">
                    <img className="group list-group-image" src={this.props.value.image} alt=""/>
                    <div className="caption">
                        <h4 className="group inner list-group-item-heading">{this.props.value.name}</h4>
                        <p className="group inner list-group-item-text">{this.props.value.description}</p>
                        <div className="row">
                            <div className="col-xs-12 col-md-6">
                                <p className="lead">$ {this.props.value.price}</p>
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
