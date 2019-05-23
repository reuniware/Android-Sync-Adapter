
        // Put this code in the onCreate event of the starting activity of your app.
        
        val accountManager = this.applicationContext.getSystemService(Context.ACCOUNT_SERVICE) as AccountManager
        val account = Account("dummyaccount", "com.datasync.syncserviceaccount")
        accountManager.addAccountExplicitly(account, null, null)
        val settingsBundle = Bundle()
        settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true)
        settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true)
        //ContentResolver.requestSync(account, "com.datasync.StubProvider", settingsBundle)
        ContentResolver.setSyncAutomatically(account,"com.datasync.StubProvider", true)
        //ContentResolver.addPeriodicSync(account, "com.datasync.StubProvider", Bundle.EMPTY, 60*15)

