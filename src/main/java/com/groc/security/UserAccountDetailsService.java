package com.groc.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.groc.data.domain.GrocUser;

public class UserAccountDetailsService implements UserDetailsService {
	
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		GrocUser grocUser = null ; 
		return new User(grocUser.getName(), grocUser.getPasssword(),
				AuthorityUtils.createAuthorityList(grocUser.getAuthorities()));
	}
	
	
	/*@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		com.groc.data.domain.User user = null ; //getUserAccount(username);
		return new User(user.getName(), user.getPasssword(),
				AuthorityUtils.createAuthorityList(account.getAuthority()));
	}

	public UserAccount getUserAccount(String username) {
		try {
			TypedQuery<UserAccount> query = UserAccount
					.findUserAccountsByUsernameEquals(username);
			return query.getSingleResult();
		} catch (EmptyResultDataAccessException ex) {
			throw new UsernameNotFoundException("Could not find user "
					+ username, ex);
		}
	}*/
}
