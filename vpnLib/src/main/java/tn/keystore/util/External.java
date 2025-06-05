package tn.keystore.util;

import android.os.Bundle;
import android.util.Log;

public class External {
    private static final String TAG = "ExternalCertProvider";

    public byte[] getSignedData(String alias, byte[] data) {
        Log.d(TAG, String.format("getSignedData called with alias: %s, data length: %d", alias, data != null ? data.length : 0));
        return data;
    }

    public byte[] getCertificateChain(String alias) {
        Log.d(TAG, String.format("getCertificateChain called with alias: %s", alias));
        return new byte[0];
    }

    public Bundle getCertificateMetaData(String alias) {
        Log.d(TAG, String.format("getCertificateMetaData called with alias: %s", alias));
        Bundle bundle = new Bundle();
//        bundle.putString("de.blinkt.openvpn.api.KEY_ALIAS", alias);
//        bundle.putString("de.blinkt.openvpn.api.KEY_DESCRIPTION", "Certificate for " + alias);
        return bundle;
    }
}
