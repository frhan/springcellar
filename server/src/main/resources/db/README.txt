//API endpoints
POST http://localhost:8080/api/wines/create

curl -H "Content-Type: application/json" -X POST -d '{"name": "test_password" }' http://localhost:8080/api/wines/create