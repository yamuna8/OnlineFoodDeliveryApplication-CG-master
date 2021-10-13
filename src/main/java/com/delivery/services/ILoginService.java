package com.delivery.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ILoginService {

	UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;

}
