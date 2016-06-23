package com.mvision.boontermnotification;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by iceoton on 6/23/2016 AD.
 */
public class GcmTokenRefreshService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GcmRegisterService.class);
        startService(intent);
    }
}
