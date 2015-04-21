/*
 * Copyright (C) 2014 Disrupted Systems
 * This file is part of Rumble.
 * Rumble is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Rumble is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with Rumble.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.disrupted.rumble.network.linklayer.wifi;

import android.content.Context;
import android.net.wifi.WifiManager;

import org.disrupted.rumble.app.RumbleApplication;

/**
 * @author Marlinski
 */
public class WifiUtil {

    public static WifiManager getWifiManager() {
        return (WifiManager) RumbleApplication.getContext().getSystemService(Context.WIFI_SERVICE);
    }

    public static boolean isEnabled() {
       return getWifiManager().isWifiEnabled();
    }

    public static void enableWifi() {
        getWifiManager().setWifiEnabled(true);
    }


}
