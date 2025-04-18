# **HTTP (Hypertext Transfer Protocol) - Key Notes**

---

### **1. What is HTTP?**
**HTTP** is the protocol used to transfer data over the web between clients (browsers) and servers. It enables the request and retrieval of web resources like HTML, images, and videos.

---

### **2. Structure of HTTP Requests:**
- **Request Line**: Contains the method, resource, and HTTP version.  
  Example:  
  `GET /index.html HTTP/1.1`
- **Headers**: Provide additional info about the request.  
  Example:  
  `Host: www.example.com`
- **Body**: Optional data sent with the request (e.g., form data).

---

### **3. Structure of HTTP Responses:**
- **Status Line**: Contains HTTP version, status code, and message.  
  Example:  
  `HTTP/1.1 200 OK`
- **Headers**: Metadata about the response.  
  Example:  
  `Content-Type: text/html`
- **Body**: Contains the data sent back to the client (e.g., HTML content).

---

### **4. HTTP Methods:**
- **GET**: Retrieves data from the server.
- **POST**: Sends data to the server to create/update a resource.
- **PUT**: Updates an existing resource.
- **DELETE**: Deletes a resource.
- **HEAD**: Retrieves headers without the body.
- **OPTIONS**: Describes communication options for the resource.

---

### **5. HTTP Status Codes:**
- **2xx (Success)**: Request successful.  
  Example: `200 OK`
- **3xx (Redirection)**: Resource has moved.  
  Example: `301 Moved Permanently`
- **4xx (Client Error)**: Client-side errors.  
  Example: `404 Not Found`
- **5xx (Server Error)**: Server-side errors.  
  Example: `500 Internal Server Error`

---

### **6. Example HTTP Communication:**
1. **Request (GET Method):**  
   ```http
   GET /index.html HTTP/1.1
   Host: www.example.com

##2 Response (200 OK):
#HTTP
HTTP/1.1 200 OK
Content-Type: text/html
<html><body><h1>Welcome!</h1></body></html>

##HTTP/2 and HTTPS:
HTTP/2: Enhances performance with multiplexing and header compression.

HTTPS: Secure version of HTTP using SSL/TLS to encrypt data.

##HTTP Headers:
Content-Type: Specifies media type (e.g., text/html, application/json).

User-Agent: Identifies the client making the request.

Authorization: Contains credentials (e.g., Bearer token).

##Key Takeaways:
HTTP is the foundation of web communication.

It operates on a request-response model.

Status codes indicate the result of the request.

HTTP/2 and HTTPS improve performance and security.