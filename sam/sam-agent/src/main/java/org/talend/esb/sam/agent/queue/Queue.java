package org.talend.esb.sam.agent.queue;

import java.io.Serializable;

import org.talend.esb.sam.common.event.MonitoringException;

public interface Queue<O extends Serializable> {

	/**
	 * Adds a new object to the queue
	 * @param object
	 */
	public void add(O object) throws MonitoringException;
	
	/**
	 * Returns true if queue is empty
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Returns one element from queue and removes it.
	 * @return
	 */
	public O remove() throws MonitoringException;
}