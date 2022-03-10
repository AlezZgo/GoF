package facade

class Repository(private val cacheDataSource: CacheDataSource,
                 private val cloudDataSource: CloudDataSource,
                 private val mapper: Mapper) {

    fun doSomethingInFacade(){
        cacheDataSource.use()
        cloudDataSource.use()
        mapper.use()
    }
}