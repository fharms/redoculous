/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.ocpsoft.redoculous.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
@XmlRootElement
public class RepositoryStatus
{
   public static enum State
   {
      MISSING, CLONING, INITIALIZED, CHECKOUT_REF, UPDATING, PURGING
   }

   private State state;
   private String message;

   public RepositoryStatus()
   {}

   public RepositoryStatus(State state)
   {
      this.state = state;
   }

   public RepositoryStatus(State state, String message)
   {
      this.state = state;
      this.message = message;
   }

   public String getMessage()
   {
      return message;
   }

   public State getState()
   {
      return state;
   }
}
