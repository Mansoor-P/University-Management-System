package mansoor.github.unimanage.utils;

public class MenuItem {
    private String main;
    private String[] submenu;

    public MenuItem(String main, String... submenu) {
        this.main = main;
        this.submenu = submenu;
    }

    public String getMain() {
        return main;
    }

    public String[] getSubmenu() {
        return submenu;
    }
}
