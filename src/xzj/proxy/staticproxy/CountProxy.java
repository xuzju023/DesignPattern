package xzj.proxy.staticproxy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 10:29 2019/2/1
 */
public class CountProxy  implements Count {
        private Count count;  //组合一个业务实现类对象来进行真正的业务方法的调用

        /**
         * 覆盖默认构造器
         *
         * @param count
         */
        public CountProxy(Count count) {
            this.count = count;
        }

        @Override
        public void queryCount() {
            System.out.println("查询账户的预处理——————");
            // 调用真正的查询账户方法
            count.queryCount();
            System.out.println("查询账户之后————————");
        }

        @Override
        public void updateCount() {
            System.out.println("修改账户之前的预处理——————");
            // 调用真正的修改账户操作
            count.updateCount();
            System.out.println("修改账户之后——————————");

        }

}
