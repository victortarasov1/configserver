package executor.service.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigserverApplication

fun main(args: Array<String>) {
	runApplication<ConfigserverApplication>(*args)
}
