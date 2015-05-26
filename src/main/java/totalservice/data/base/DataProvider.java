package totalservice.data.base;

import java.sql.SQLException;
import java.util.List;

import totalservice.models.firm.Firm;
import totalservice.models.user.User;
import totalservice.utilities.ValidationException;

public interface DataProvider {

	public List<User> selectUsers(String query) throws SQLException, ValidationException;
	boolean addUser(User user) throws SQLException;
	boolean editUser(User user,int id);
	public void deletUser(int id);
	public User loginUser();
	
	public List<Firm> selectFirms(String query) throws SQLException, ValidationException;
	boolean addFirm(Firm user) throws SQLException;
	boolean editFirm(Firm user,int id);
	public void deletFirm(int id);

}
