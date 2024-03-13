package uke10.delegering.settings;

public interface ISettings {
	boolean hasSetting(String s);
	Object getSetting(String s);
	void updateSetting(String s, Object o);
}
