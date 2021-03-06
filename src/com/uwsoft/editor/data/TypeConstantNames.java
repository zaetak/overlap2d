/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package com.uwsoft.editor.data;

import java.util.HashMap;

public class TypeConstantNames {
		
	public static HashMap<Integer, String> triggerNames;
	
	public static HashMap<Integer, String>actionNames;
	
	public static String getTriggerName(Integer id) {
		if(triggerNames == null) {
			init();
		}
		
		return triggerNames.get(id);
	}
	
	public static String getActionName(Integer id) {
		if(actionNames == null) {
			init();
		}
		
		return actionNames.get(id);
	}	
	
	public static void init() {
		triggerNames = new HashMap<Integer, String>();
		actionNames = new HashMap<Integer, String>();
		
		
		triggerNames.put(TypeConstants.COLLISION_TRIGGER, "OnCollide");
		triggerNames.put(TypeConstants.DOOR_OPENED_TRIGGER, "OnDoorOpened");
		triggerNames.put(TypeConstants.DOOR_CLOSED_TRIGGER, "OnDoorClosed");
		
		triggerNames.put(TypeConstants.TURNED_ON_TRIGGER, "TurnedOn");
		triggerNames.put(TypeConstants.TURNED_OFF_TRIGGER, "TurnedOf");
		triggerNames.put(TypeConstants.ON_WORLD_START, "OnWorldStart");
		
		
		//////////
		actionNames.put(TypeConstants.OPEN_ACTION, "OpenDoor");
		actionNames.put(TypeConstants.CLOSE_ACTION, "CloseDoor");
		actionNames.put(TypeConstants.KEY_COMEBACK, "KeyShow");
		actionNames.put(TypeConstants.KEY_DISSAPEAR, "KeyHide");
		
		actionNames.put(TypeConstants.TURN_ON, "TurnOn");
		actionNames.put(TypeConstants.TURN_OFF, "TurnOff");		
		
		actionNames.put(TypeConstants.SHOW, "SHOW");
		actionNames.put(TypeConstants.HIDE, "HIDE");	
		
		actionNames.put(TypeConstants.LOCK_ACTION, "LOCK");
		actionNames.put(TypeConstants.UNLOCK_ACTION, "UNLOCK");		
		
		actionNames.put(TypeConstants.START_TWEEN, "start tween");
		actionNames.put(TypeConstants.STOP_TWEEN, "stop tween");
		actionNames.put(TypeConstants.PAUSE_TWEEN, "pause tween");
		
	}

}
