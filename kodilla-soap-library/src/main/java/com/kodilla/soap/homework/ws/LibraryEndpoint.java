package com.kodilla.soap.homework.ws;

        import com.kodilla.soap.homework.repository.LibraryRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private LibraryRepository libraryRepository;

    @Autowired
    public LibraryEndpoint(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSignatureNumber")
//    @ResponsePayload
//    public GetSignatureNumber getSignatureNumber(@RequestPayload GetSignatureNumber request) {
//        GetSignatureNumber response = new GetSignatureNumber();
//        response.setSignature(libraryRepository.findBook(request.getSignature()));
//
//        return response;
//    }
    //getSignature z GetSignatureNumber nie widzi getSignature
}