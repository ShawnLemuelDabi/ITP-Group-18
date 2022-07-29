package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.itpgroup18.groceryhunters.DataBinderMapperImpl());
  }
}
