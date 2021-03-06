/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.data.engine.internal.executor;

import com.liferay.data.engine.exception.DEDataDefinitionException;
import com.liferay.data.engine.executor.DEDataDefinitionDeleteRequestExecutor;
import com.liferay.data.engine.executor.DEDeleteRequest;
import com.liferay.data.engine.executor.DEDeleteRequestExecutor;
import com.liferay.data.engine.executor.DEDeleteResponse;
import com.liferay.data.engine.service.DEDataDefinitionDeleteRequest;
import com.liferay.data.engine.service.DEDataDefinitionDeleteResponse;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jeyvison Nascimento
 */
@Component(immediate = true, service = DEDeleteRequestExecutor.class)
public class DEDeleteRequestExecutorImpl implements DEDeleteRequestExecutor {

	@Override
	public <T extends DEDeleteResponse> T execute(
			DEDeleteRequest deDeleteRequest)
		throws PortalException {

		return (T)deDeleteRequest.accept(this);
	}

	@Override
	public DEDataDefinitionDeleteResponse executeDeleteRequest(
			DEDataDefinitionDeleteRequest deDataDefinitionDeleteRequest)
		throws DEDataDefinitionException {

		return deDataDefinitionDeleteRequestExecutor.execute(
			deDataDefinitionDeleteRequest);
	}

	@Reference
	protected DEDataDefinitionDeleteRequestExecutor
		deDataDefinitionDeleteRequestExecutor;

}