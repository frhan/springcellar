import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import WineList from './components/WineList'

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to Wine Celller</h1>
        </header>
        <div className="wine-wrapper container">
          <WineList />
        </div>
      </div>
    );
  }
}

export default App;
