package com.newportcapital.sia_erp.application.port.out;

public interface PasswordHasherServicePort {
    String hash(String rawPassword);
    boolean matches(String rawPassword, String hashedPassword);
}
