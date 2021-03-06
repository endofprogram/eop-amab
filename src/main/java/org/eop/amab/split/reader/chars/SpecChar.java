package org.eop.amab.split.reader.chars;

/**
 * @author lixinjie
 * @since 2017-05-05
 */
public enum SpecChar {
	
	Bspace(' '),
	Tab('\t'),
	
	CReturn('\r'),
	LFeed('\n'),
	
	
	Fslash('/'),
	Bslash('\\'),
	
	Hash('#'),
	Dollar('$'),
	Asterisk('*'),
	
	Squote('\''),
	Dquote('"'),
	
	Obrace('{'),
	Cbrace('}'),
	
	End('\0'),
	
	None((char)-1);
	
	private char _char;
	
	private SpecChar(char _char) {
		this._char = _char;
	}
	
	public boolean match(char _char) {
		return this._char == _char;
	}
	
	public char toChar() {
		return _char;
	}
	
	public static SpecChar fromChar(char _char) {
		switch (_char) {
			case ' ' : return Bspace;
			case '\t' : return Tab;
			
			case '\r' : return CReturn;
			case '\n' : return LFeed;
			
			case '/' : return Fslash;
			case '\\' : return Bslash;
			
			case '#' : return Hash;
			case '$' : return Dollar;
			case '*' : return Asterisk;
			
			case '\'' : return Squote;
			case '"' : return Dquote;
			
			case '{' : return Obrace;
			case '}' : return Cbrace;
			
			case '\0' : return End;
			
			default : return None;
		}
	}
}
