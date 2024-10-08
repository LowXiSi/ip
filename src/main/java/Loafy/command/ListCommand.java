package loafy.command;

import loafy.tasklist.TaskList;
import loafy.ui.Ui;

/**
 * Represents a command to list the current tasks in the task list.
 */
public class ListCommand extends Command {

    /**
     * Displays the current tasks in the task list.
     *
     * @param tasks Task list to be displayed.
     * @param ui User interface.
     * @return A formatted view of the current task list.
     */
    public String execute(TaskList tasks, Ui ui) {
        return tasks.view();
    }
}
