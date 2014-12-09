package br.gov.camara.edemocracia.portlets.chat;

public class ChatRoomUserBean {

	private String userName;
	private String userUF;
	private String userEmail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserUF() {
		return userUF;
	}

	public void setUserUF(String userUF) {
		this.userUF = userUF;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
	    result = prime * result + ((userName == null) ? 0 : userName.hashCode());
	    result = prime * result + ((userUF == null) ? 0 : userUF.hashCode());
	    return result;
    }

	@Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    ChatRoomUserBean other = (ChatRoomUserBean) obj;
	    if (userEmail == null) {
		    if (other.userEmail != null)
			    return false;
	    } else if (!userEmail.equals(other.userEmail))
		    return false;
	    if (userName == null) {
		    if (other.userName != null)
			    return false;
	    } else if (!userName.equals(other.userName))
		    return false;
	    if (userUF == null) {
		    if (other.userUF != null)
			    return false;
	    } else if (!userUF.equals(other.userUF))
		    return false;
	    return true;
    }

	

}
