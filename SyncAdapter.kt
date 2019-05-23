package com.datasync

import android.accounts.Account
import android.content.*
import android.os.Bundle
import android.util.Log

class SyncAdapter @JvmOverloads constructor(
        context: Context,
        autoInitialize: Boolean,
        allowParallelSyncs: Boolean = false,
        val mContentResolver: ContentResolver = context.contentResolver
) : AbstractThreadedSyncAdapter(context, autoInitialize, allowParallelSyncs) {

    override fun onPerformSync(account: Account?, extras: Bundle?, authority: String?, provider: ContentProviderClient?, syncResult: SyncResult?) {
        // Here you perform the synchronization process
    }

}
