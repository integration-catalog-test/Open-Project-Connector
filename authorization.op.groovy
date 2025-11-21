authentication {
    rest {
        basic {
            request.header("Authorization", "Basic " +
                    Base64.getEncoder().encodeToString((configuration.getRestUsername() +
                            ":" + decrypt(configuration.getRestPassword()))).getBytes())
        }
    }
}
