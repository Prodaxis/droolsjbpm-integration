package org.kie.services.client.serialization.jaxb.impl;

import org.kie.services.client.serialization.jaxb.JaxbCommandsRequest;

public interface JaxbCommandResponse<T> {

    /**
     * @return The index of the command in the {@link JaxbCommandsRequest#getCommands()} list. 
     */
    public Integer getIndex();

    /**
     * This method is necessary for the YAML framework (which expects getters *and* setters) to work with these objects. 
     * @param index
     */
    public void setIndex(Integer index);
    
    /**
     * @return The (simple) name of the command class that generated this response. 
     */
    public String getCommandName();
    
     /**
      * This method is necessary for the YAML framework (which expects getters *and* setters) to work with these objects. 
      * @param cmdName
      */
    public void setCommandName(String cmdName);

    /**
     * @return The result object generated by the command. If the command does not return an object, null.
     */
    public T getResult();

      /**
       * This method is necessary for the YAML framework (which expects getters *and* setters) to work with these objects. 
       * @param result
       */
    public void setResult(T result);

}