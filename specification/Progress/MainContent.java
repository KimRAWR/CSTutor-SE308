package Progress;

import java.util.Collection;
/**
 * Largest rectangular section on the page that will display content 
 * such as graphs and statistics.
 */
 
public abstract class MainContent {
    private Collection<Student> students;

    /**
     * Adds a graph to the content box so it can be displayed.
     * @param   g  absract graph type to display
     */ 
    public abstract void addGraph(Graph g);

    /**
     * Removes a graph from the content box. If the graph has not been inserted
     * into the content box, nothing changes.
     * @param   g  graph to be removed.
     */
    public abstract void removeGraph(Graph g);
	
    /** 
     * Clears all content from the section.
     */
    public abstract void clearContent();
}
