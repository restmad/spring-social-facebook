/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook;


/**
 * Interface specifying a basic set of operations for interacting with Facebook.
 * Implemented by {@link FacebookTemplate}. Not often used directly, but a
 * useful option to enhance testability, as it can easily be mocked or stubbed.
 * @author Craig Walls
 */
public interface FacebookApi extends GraphApi {
	
	/**
	 * API for performing operations on Facebook user profiles.
	 */
	UserOperations userOperations();
	
	/**
	 * API for performing Facebook Places checkin operations.
	 */
	CheckinOperations checkinOperations();
	
	/**
	 * API for performing operations against user likes and interests.
	 */
	LikeOperations likeOperations();

	/**
	 * API for performing operations on feeds.
	 */
	FeedOperations feedOperations();
	
	/**
	 * API for performing operations with a user's set of friends.
	 */
	FriendOperations friendOperations();
	
	/**
	 * API for performing operations on groups.
	 */
	GroupOperations groupOperations();

	/**
	 * API for reading and posting comments.
	 */
	CommentOperations commentOperations();

	/**
	 * API for performing operations on events.
	 */
	EventOperations eventOperations();
	
	/**
	 * API for performing operations on albums, photos, and videos.
	 */
	MediaOperations mediaOperations();
	
}
