/*
 * This file is generated by jOOQ.
 */
package com.enginedevops.todolist.jooq.tables.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Todolist implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String title;
    private final Boolean completed;
    private final String status;

    public Todolist(Todolist value) {
        this.id = value.id;
        this.title = value.title;
        this.completed = value.completed;
        this.status = value.status;
    }

    public Todolist(
        Integer id,
        String title,
        Boolean completed,
        String status
    ) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.status = status;
    }

    /**
     * Getter for <code>public.todolist.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.todolist.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Getter for <code>public.todolist.completed</code>.
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * Getter for <code>public.todolist.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Todolist other = (Todolist) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.completed == null) {
            if (other.completed != null)
                return false;
        }
        else if (!this.completed.equals(other.completed))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.completed == null) ? 0 : this.completed.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Todolist (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(completed);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}