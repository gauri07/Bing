
public class AdmAccessToken 
{
        private String accessToken;
		private String tokenType;
		private String expiresIn;
		private String scope;
		public String getAccessToken() {
			return accessToken;
		}
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		public String getTokenType() {
			return tokenType;
		}
		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}
		public String getExpiresIn() {
			return expiresIn;
		}
		public void setExpiresIn(String expiresIn) {
			this.expiresIn = expiresIn;
		}
		public String getScope() {
			return scope;
		}
		public void setScope(String scope) {
			this.scope = scope;
		}
		@Override
		public String toString() {
			return "AdmAccessToken [accessToken=" + accessToken + ", tokenType=" + tokenType + ", expiresIn=" + expiresIn
					+ ", scope=" + scope + "]";
		}
}


