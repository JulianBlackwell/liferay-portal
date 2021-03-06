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

package com.liferay.change.tracking.engine.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CTEEntry. This utility wraps
 * {@link com.liferay.change.tracking.engine.service.impl.CTEEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CTEEntryLocalService
 * @see com.liferay.change.tracking.engine.service.base.CTEEntryLocalServiceBaseImpl
 * @see com.liferay.change.tracking.engine.service.impl.CTEEntryLocalServiceImpl
 * @generated
 */
@ProviderType
public class CTEEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.change.tracking.engine.service.impl.CTEEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static void addCTECollectionCTEEntries(long cteCollectionId,
		java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> cteEntries) {
		getService().addCTECollectionCTEEntries(cteCollectionId, cteEntries);
	}

	public static void addCTECollectionCTEEntries(long cteCollectionId,
		long[] cteEntryIds) {
		getService().addCTECollectionCTEEntries(cteCollectionId, cteEntryIds);
	}

	public static void addCTECollectionCTEEntry(long cteCollectionId,
		com.liferay.change.tracking.engine.model.CTEEntry cteEntry) {
		getService().addCTECollectionCTEEntry(cteCollectionId, cteEntry);
	}

	public static void addCTECollectionCTEEntry(long cteCollectionId,
		long cteEntryId) {
		getService().addCTECollectionCTEEntry(cteCollectionId, cteEntryId);
	}

	/**
	* Adds the cte entry to the database. Also notifies the appropriate model listeners.
	*
	* @param cteEntry the cte entry
	* @return the cte entry that was added
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry addCTEEntry(
		com.liferay.change.tracking.engine.model.CTEEntry cteEntry) {
		return getService().addCTEEntry(cteEntry);
	}

	public static void clearCTECollectionCTEEntries(long cteCollectionId) {
		getService().clearCTECollectionCTEEntries(cteCollectionId);
	}

	/**
	* Creates a new cte entry with the primary key. Does not add the cte entry to the database.
	*
	* @param cteEntryId the primary key for the new cte entry
	* @return the new cte entry
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry createCTEEntry(
		long cteEntryId) {
		return getService().createCTEEntry(cteEntryId);
	}

	public static void deleteCTECollectionCTEEntries(long cteCollectionId,
		java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> cteEntries) {
		getService().deleteCTECollectionCTEEntries(cteCollectionId, cteEntries);
	}

	public static void deleteCTECollectionCTEEntries(long cteCollectionId,
		long[] cteEntryIds) {
		getService().deleteCTECollectionCTEEntries(cteCollectionId, cteEntryIds);
	}

	public static void deleteCTECollectionCTEEntry(long cteCollectionId,
		com.liferay.change.tracking.engine.model.CTEEntry cteEntry) {
		getService().deleteCTECollectionCTEEntry(cteCollectionId, cteEntry);
	}

	public static void deleteCTECollectionCTEEntry(long cteCollectionId,
		long cteEntryId) {
		getService().deleteCTECollectionCTEEntry(cteCollectionId, cteEntryId);
	}

	/**
	* Deletes the cte entry from the database. Also notifies the appropriate model listeners.
	*
	* @param cteEntry the cte entry
	* @return the cte entry that was removed
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry deleteCTEEntry(
		com.liferay.change.tracking.engine.model.CTEEntry cteEntry) {
		return getService().deleteCTEEntry(cteEntry);
	}

	/**
	* Deletes the cte entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cteEntryId the primary key of the cte entry
	* @return the cte entry that was removed
	* @throws PortalException if a cte entry with the primary key could not be found
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry deleteCTEEntry(
		long cteEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCTEEntry(cteEntryId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTEEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTEEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.change.tracking.engine.model.CTEEntry fetchCTEEntry(
		long cteEntryId) {
		return getService().fetchCTEEntry(cteEntryId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> getCTECollectionCTEEntries(
		long cteCollectionId) {
		return getService().getCTECollectionCTEEntries(cteCollectionId);
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> getCTECollectionCTEEntries(
		long cteCollectionId, int start, int end) {
		return getService()
				   .getCTECollectionCTEEntries(cteCollectionId, start, end);
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> getCTECollectionCTEEntries(
		long cteCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.engine.model.CTEEntry> orderByComparator) {
		return getService()
				   .getCTECollectionCTEEntries(cteCollectionId, start, end,
			orderByComparator);
	}

	public static int getCTECollectionCTEEntriesCount(long cteCollectionId) {
		return getService().getCTECollectionCTEEntriesCount(cteCollectionId);
	}

	/**
	* Returns the cteCollectionIds of the cte collections associated with the cte entry.
	*
	* @param cteEntryId the cteEntryId of the cte entry
	* @return long[] the cteCollectionIds of cte collections associated with the cte entry
	*/
	public static long[] getCTECollectionPrimaryKeys(long cteEntryId) {
		return getService().getCTECollectionPrimaryKeys(cteEntryId);
	}

	/**
	* Returns a range of all the cte entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTEEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cte entries
	* @param end the upper bound of the range of cte entries (not inclusive)
	* @return the range of cte entries
	*/
	public static java.util.List<com.liferay.change.tracking.engine.model.CTEEntry> getCTEEntries(
		int start, int end) {
		return getService().getCTEEntries(start, end);
	}

	/**
	* Returns the number of cte entries.
	*
	* @return the number of cte entries
	*/
	public static int getCTEEntriesCount() {
		return getService().getCTEEntriesCount();
	}

	/**
	* Returns the cte entry with the primary key.
	*
	* @param cteEntryId the primary key of the cte entry
	* @return the cte entry
	* @throws PortalException if a cte entry with the primary key could not be found
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry getCTEEntry(
		long cteEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCTEEntry(cteEntryId);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<?extends com.liferay.portal.kernel.model.PersistedModel> getPersistedModel(
		long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(resourcePrimKey);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static boolean hasCTECollectionCTEEntries(long cteCollectionId) {
		return getService().hasCTECollectionCTEEntries(cteCollectionId);
	}

	public static boolean hasCTECollectionCTEEntry(long cteCollectionId,
		long cteEntryId) {
		return getService().hasCTECollectionCTEEntry(cteCollectionId, cteEntryId);
	}

	public static void setCTECollectionCTEEntries(long cteCollectionId,
		long[] cteEntryIds) {
		getService().setCTECollectionCTEEntries(cteCollectionId, cteEntryIds);
	}

	/**
	* Updates the cte entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cteEntry the cte entry
	* @return the cte entry that was updated
	*/
	public static com.liferay.change.tracking.engine.model.CTEEntry updateCTEEntry(
		com.liferay.change.tracking.engine.model.CTEEntry cteEntry) {
		return getService().updateCTEEntry(cteEntry);
	}

	public static CTEEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CTEEntryLocalService, CTEEntryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CTEEntryLocalService.class);

		ServiceTracker<CTEEntryLocalService, CTEEntryLocalService> serviceTracker =
			new ServiceTracker<CTEEntryLocalService, CTEEntryLocalService>(bundle.getBundleContext(),
				CTEEntryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}