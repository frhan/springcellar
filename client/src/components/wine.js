import React from 'react';
import "./wine.css"
import {Button,ButtonToolbar} from "react-bootstrap";
// import './bootstrap/css/bootstrap.css';
//
export default class Wine extends React.Component {
  constructor(props) {
    super(props);
  }

  render(){
    return(
      <div>
      <div className="col-md-2 column productbox">
    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" className="img-responsive"/>
    <div className="producttitle">Product 2</div>
    <div className="productprice"><div className="pull-right"><a href="#" className="btn btn-danger btn-sm" role="button">BUY</a></div><div className="pricetext">£8.95</div></div>
</div>
<div className="col-md-2 column productbox">
    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" className="img-responsive"/>
    <div className="producttitle">Product 2</div>
    <div className="productprice"><div className="pull-right"><a href="#" className="btn btn-danger btn-sm" role="button">BUY</a></div><div className="pricetext">£8.95</div></div>
</div>
<div className="col-md-2 column productbox">
    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" className="img-responsive"/>
    <div className="producttitle">Product 3</div>
    <div className="productprice"><div className="pull-right"><a href="#" className="btn btn-danger btn-sm" role="button">BUY</a></div><div className="pricetext">£8.95</div></div>
</div>
<div className="col-md-2 column productbox">
    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" className="img-responsive"/>
    <div className="producttitle">Product 4</div>
    <div className="productprice"><div className="pull-right"><a href="#" className="btn btn-danger btn-sm" role="button">BUY</a></div><div className="pricetext">£8.95</div></div>
</div>
    </div>
    );
  }
}
