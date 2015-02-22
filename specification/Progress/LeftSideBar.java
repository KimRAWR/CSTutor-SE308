package Progress;

import java.util.Collection;

/**
 * Rectangular content section on the left side of the page that 
 * contains tabs with different view options and other information.
 */
public abstract class LeftSideBar {
    private Collection<Tab> tabs;

    /**
     * Adds a tab to the side bar.
     * @param   tabTitle  the title to be displayed on the new tab
     */ 
    public abstract void addTab(String tabTitle);

    /**
     * Adds an expandable list to a certain tab.
     * @param   curTab  tab to add the list to
     * @param   l       expandable list to add the curTab
     */   
    public abstract void addListToTab(Tab curTab, List l); 

}
