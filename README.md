Simple REST application making use of CORS.

Cross-Origin Resource Sharing (CORS) is a technique for relaxing the same-origin policy, allowing Javascript on a web page to consume a REST API served from a different origin. If CORS is not used in the secondary application (the one running on port 9000), Javascript will not function and cannot illustrate the data retrieved from REST layer. It cannot do so since the secondary application does not have right to connect to the primary application on port 8080.
