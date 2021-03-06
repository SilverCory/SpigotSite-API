package be.maximvdw.spigotsite.api.user;

import java.util.List;

import be.maximvdw.spigotsite.api.user.exceptions.InvalidCredentialsException;

/**
 * Spigot User Manager
 * 
 * @author Maxim Van de Wynckel
 */
public interface UserManager {
	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid);

	/**
	 * Get a list of users by their name
	 * 
	 * @param name
	 *            Name
	 * @return List of users
	 */
	public List<User> getUsersByName(String name);

	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @param user
	 *            Authenticated {@link be.maximvdw.spigotsite.api.user.User}
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid, User user);

	/**
	 * Authenticate a spigot user
	 * 
	 * @param username
	 *            Username or Email address
	 * @param password
	 *            Password
	 * @return Authenticated Spigot user
	 */
	public User authenticate(String username, String password)
			throws InvalidCredentialsException;

	/**
	 * Log off a spigot user
	 * 
	 * @param user
	 *            Authenticated Spigot user
	 */
	public void logOff(User user);

	/**
	 * Get user ranks
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.user.UserRank}
	 */
	public List<UserRank> getUserRanks();

	/**
	 * Get users by rank
	 * 
	 * @param rank
	 * @return List of {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public List<User> getUsersByRank(UserRank rank);

	/**
	 * Get online members
	 * 
	 * @return List of members
	 */
	public List<User> getOnlineUsers();
}
