package _3_interface;

class StringAndInteger implements GenericInterface<String, Integer>{

    @Override
    public Integer doSomeOperations (String s) {
        return Integer.parseInt(s);
    }

    @Override
    public String doReverseOperations(Integer integer) {
        return integer.toString();
    }

}