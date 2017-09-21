package contacts;

import java.util.List;

public interface TelbookOperation {
	public List<Telbook> selectByCreater(String creater);

	public void addTelbook(Telbook telbook);

	public void updateTelbook(Telbook telbook);

	public void deleteTelbook(Telbook telbook);
}
