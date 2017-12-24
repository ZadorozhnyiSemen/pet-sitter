package com.ps.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by iuliana.cosmina on 9/14/15.
 */
//From docs 'Registers the {@link DelegatingFilterProxy} to use the springSecurityFilterChain before any other registered {@link Filter}
//So I think that what we need?
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
}
