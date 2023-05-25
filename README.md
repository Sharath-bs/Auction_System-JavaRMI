                                                                  **Objective**

To develop a distributed application using Java for an Auction system for users to place bids on a product for sale.





                                                             **Problem-solving approach**

Server Process: starts an RMI registry and hosts the bidding. The server requests users to enter item info and a base price to start the bidding. A time is specified that defines the time for which the bid will take place.
Client process: The client process can run on multiple machines or terminals to enact users. The client will take the client’s info and the item that they want to bid on. Clients are notified about other bids bid by other clients and are informed about the bid winner. 

We make use of RMI, an API that enables one object to call a method on another object that is in a different address space—this other address space may be on the same machine or on a different machine entirely. RMI allows an object that is operating in a JVM on a computer (Client-side) to call methods on an object that is running in another JVM (Server-side). Through straightforward method calls on the server object, RMI's public remote server object makes it possible for the client- and server-side communications.
