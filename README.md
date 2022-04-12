# CrudProxyBandTest

App has 4 endpoints
  - post 
      "addUser" 
      with request body 
        JSON format: 
          {
            "name" : "Test Name",
            "email" : "TestEmail@Exmple.com"
          }
  - get
      "getUsers"
      without body
  - patch
      "/updateUser/{id}"
      where {id} is user id
      with request body
        JSON format:
          {
            "name" : "Test Name",
            "email" : "TestEmail@Exmple.com"
          }
          or
          {
            "name" : "Test Name"
          }
          or
          {
            "email" : "TestEmail@Exmple.com"
          }
  - delete
      "deleteUser/{id}"
        where {id} is user id
        without body
