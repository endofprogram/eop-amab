package org.eop.amab.test

import org.eop.amab.AmabCompiler
import org.eop.amab.AmabSetting
import org.eop.amab.AmabSpliter
import org.eop.amab.CompiledCode
import org.eop.amab.SourceCode
import org.eop.amab.SplitedCode
import org.eop.chassis.test.AbstractCommonTest
import org.junit.Test

/**
 * @author lixinjie
 * @since 2017-05-06
 */
class AmabCompilerTest extends AbstractCommonTest {

	@Test
	void test1() {
		SplitedCode splitedCode = AmabSpliter.split(new SourceCode(getSource()))
		AmabSetting setting = new AmabSetting()
		CompiledCode compiledCode = AmabCompiler.compile(splitedCode, setting)
		println compiledCode.display()
	}
	
	String getSource() {
		'''\
<?xml version="1.0" encoding="UTF-8"?>
<Request>
	<Name>${input://person{}/name<>}</Name>
	<Age>${input://person{}/age<>}</Age>
	<Phones>
	#{foreach(phone in input://person{}/phones[])}
		${index}<Phone>${phone}</Phone>
		${datetime://now}
	#{end}
	</Phones>
	<Address>${input://person{}/address<>}</Address>
	<CreateTime>${datetime://now}</CreateTime>
	<RandomKey>${random://num8}</RandomKey>
	##。。。。。。。
	#*。。。。。。*#
</Request>
'''
	}
}
