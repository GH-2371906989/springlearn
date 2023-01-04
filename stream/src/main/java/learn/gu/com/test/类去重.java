package learn.gu.com.test;

import com.alibaba.fastjson.JSON;
import learn.gu.com.pojo.VerifyResult;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class 类去重 {

    private static List<VerifyResult> list = new ArrayList<>();

    static {
        list.add(VerifyResult.builder().ruleName("张三").ruleCode("001").ruleType("1").build());
        list.add(VerifyResult.builder().ruleName("李四").ruleCode("001").ruleType("2").build());
        list.add(VerifyResult.builder().ruleName("王五").ruleCode("001").ruleType("3").build());
        list.add(VerifyResult.builder().ruleName("张三").ruleCode("001").ruleType("4").build());
    }

    public static void main(String[] args) {
        Set<VerifyResult> objects = new TreeSet<>(Comparator.comparing(o->(o.getRuleName()+""+o.getRuleCode())));
        boolean b = objects.addAll(list);

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return object -> seen.putIfAbsent(keyExtractor.apply(object), Boolean.TRUE) == null;
    }
}
