/*******************************************************************************
 * Copyright (c) 2013 Pivotal Software, Inc. and others.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 
 * (http://www.eclipse.org/legal/epl-v10.html), and the Eclipse Distribution 
 * License v1.0 (http://www.eclipse.org/org/documents/edl-v10.html). 
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.flight.verticle;

import org.eclipse.flight.resources.Repository;
import org.eclipse.flight.resources.vertx.VertxRepository;
import org.vertx.java.core.Vertx;
import org.vertx.java.platform.Verticle;

/**
 * A simple in memory container for shared project resources.
 * 
 * @author Miles Parker
 */
public class VolatileRepositoryVerticle extends Verticle {

	public void start() {
		new VertxRepository(vertx);
	}
}