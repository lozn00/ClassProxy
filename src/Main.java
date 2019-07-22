import com.bug.proxy.Proxy;
import com.bug.proxy.ProxyCallback;
import java.lang.reflect.Method;

public class Main
{
	public static void main(String[] args)throws Throwable
	{
        MyObject object=new MyObject("老婆");
        boolean green=true;
        if (green)
        {
            Proxy proxy=new Proxy();
            proxy.setSuperClass(MyObject.class);
            proxy.setCallback(new ProxyCallback()
                {
                    @Override
                    public Object call(Object proxyObject, Method method, Object[] args)
                    {
                        if (method.getName().equals("getMsg"))
                        {
                            return "fuck♂";
                        }
                        return Proxy.callSuper(proxyObject, method, args);
                    }
                });
            object = (MyObject)proxy.create();
        }
        System.out.println(object.getMsg());
    }
}
