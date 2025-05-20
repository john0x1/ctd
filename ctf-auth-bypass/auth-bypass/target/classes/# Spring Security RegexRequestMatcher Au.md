# Spring Security RegexRequestMatcher Auth Bypass (CVE-2022-22978)

**Objective:**  
Exploit a misconfigured `RegexRequestMatcher` in a Spring Security application to bypass authorization and retrieve the flag from a protected endpoint.

**Background:**  
Spring Security is a widely used framework for securing Java web applications. A misconfiguration in `RegexRequestMatcher` can allow attackers to bypass access controls using encoded characters or semicolons in URLs.

**References:**  
- [Spring Security](https://spring.io/projects/spring-security)
- [CVE-2022-22978](https://nvd.nist.gov/vuln/detail/CVE-2022-22978)
- [PoC Example](https://github.com/ducluongtran9121/CVE-2022-22978-PoC)

---